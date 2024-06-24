package io.github.maxencedc.sparsestructures.mixin;

import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(RandomSpreadStructurePlacement.class)
public class PushSpreadLimit {

    // method_40170 is the lambda in the CODEC static field (net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement.lambda.static.0)
    @ModifyConstant(method = "method_40170", constant = @Constant(intValue = 4096))
    private static int pushSpreadLimit(int original) {
        return Integer.MAX_VALUE;
    }
}
