package com.xkbsx.wildernessdelight.block;

import net.minecraft.block.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

    public class HorseweedCropBlock extends SugarCaneBlock {

        public static final IntProperty AGE = Properties.AGE_15;
        protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

        public HorseweedCropBlock(Settings settings) {
            super(settings);
            this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
        }

        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
        }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        } else {
            super.scheduledTick(state, world, pos, random);
        }
    }

        // ===== 关键修改：重写 randomTick 以支持骨粉 =====
        @Override
        public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (world.isAir(pos.up())) {
                int i = 1;
                // 计算当前这株作物已经长了几格
                while (world.getBlockState(pos.down(i)).isOf(this)) {
                    i++;
                }
                // 可以修改这里的 3，把它改成你想要的最高高度（比如 4）
                int MAX_HEIGHT = 4;

                if (i < MAX_HEIGHT) {
                    int j = state.get(AGE);
                    if (j == 15) {
                        // 成熟后在上方长出新的作物
                        world.setBlockState(pos.up(), this.getDefaultState());
                        // 原格复位到幼苗状态
                        world.setBlockState(pos, state.with(AGE, 0), Block.NO_REDRAW);
                    } else {
                        // 当前格继续长大
                        world.setBlockState(pos, state.with(AGE, j + 1), Block.NO_REDRAW);
                    }
                }
            }
        }

        @Override
        public BlockState getStateForNeighborUpdate(
                BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
        ) {
            if (!state.canPlaceAt(world, pos)) {
                world.scheduleBlockTick(pos, this, 1);
            }
            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }

        // ===== 核心修改：重写 canPlaceAt，移除“要求旁边有水”的逻辑 =====
        @Override
        public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
            BlockState blockState = world.getBlockState(pos.down());

            // 1. 如果下方已经是同种作物（长在上方），允许放置
            if (blockState.isOf(this)) {
                return true;
            }

            // 2. 如果下方是泥土、沙子、草方块等，允许放置（不再检查是否有水）
            // 你还可以在这里添加 ModBlocks.SILENT_GRASS 之类的条件
            return blockState.isIn(BlockTags.DIRT) || blockState.isIn(BlockTags.SAND) || blockState.isOf(Blocks.GRASS_BLOCK);
        }

        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(AGE);
        }
    }

