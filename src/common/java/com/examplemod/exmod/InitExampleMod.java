package com.examplemod.exmod;

import dev.puzzleshq.puzzleloader.loader.mod.entrypoint.common.ModInit;

public class InitExampleMod implements ModInit {

    @Override
    public void onInit() {
        Constants.LOGGER.info("Hello from {}", InitExampleMod.class);
    }

}
