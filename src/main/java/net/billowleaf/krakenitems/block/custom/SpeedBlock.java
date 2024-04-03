package net.billowleaf.krakenitems.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SpeedBlock extends Block {
    public SpeedBlock(Properties properties) {
        super(properties);
    }



    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {

        if(entity instanceof LivingEntity LivingEntity){
            LivingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10));
        }
        super.stepOn(level, blockPos, blockState, entity);
    }
}
