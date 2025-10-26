package com.examplemod.exmod.mixins.common;

import com.examplemod.exmod.Constants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zombie.ai.StateMachine;
import zombie.characters.IsoGameCharacter;

@Mixin(StateMachine.class)
public class MixinStateMachine {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void init(IsoGameCharacter par1, CallbackInfo ci) {
        Constants.LOGGER.info("Hello from Mixin <init> in {}", MixinStateMachine.class);
    }

}
