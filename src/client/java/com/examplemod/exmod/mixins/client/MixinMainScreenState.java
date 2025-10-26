package com.examplemod.exmod.mixins.client;

import com.examplemod.exmod.Constants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zombie.gameStates.MainScreenState;

@Mixin(MainScreenState.class)
public class MixinMainScreenState {

    @Inject(method = "main", at = @At("HEAD"))
    private static void main(String[] par1, CallbackInfo ci) {
        Constants.LOGGER.info("Hello from Mixin in {}", MixinMainScreenState.class);
    }

}
