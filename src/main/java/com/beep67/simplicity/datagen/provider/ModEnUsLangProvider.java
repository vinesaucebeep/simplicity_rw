package com.beep67.simplicity.datagen.provider;

import com.beep67.simplicity.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(DataGenerator dataGenerator, String modId) {
        super(dataGenerator,modId, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(BlockInit.GREENSCHIST.get(), "Greenschist");

    }
}
