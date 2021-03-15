package jp.qhrlhplhp.helicobactermod.lists;

import jp.qhrlhplhp.helicobactermod.HelicoBacterItemGroup;
import jp.qhrlhplhp.helicobactermod.HelicoBacterMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HelicoBacterMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BlockList {
    public static Block PyloriBlock = new Block(
            Block.Properties.create(Material.IRON)
                   .hardnessAndResistance(2.0f, 3.0f)
                   .lightValue(0)
                   .harvestLevel(1)
                   .harvestTool(ToolType.PICKAXE))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_block"));

    public static Block PyloriPlank = new Block(
            Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(1.0f, 2.0f)
                    .lightValue(0)
                    .harvestLevel(0)
                    .harvestTool(ToolType.SHOVEL))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_plank"));

    public static Block UreaseBlock = new Block(
            Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 3.0f)
                    .lightValue(10)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_block"));

    public static Block UreasePlank = new Block(
            Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(1.0f, 2.0f)
                    .lightValue(15)
                    .harvestLevel(0)
                    .harvestTool(ToolType.SHOVEL))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_plank"));

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                PyloriBlock,
                PyloriPlank,
                UreaseBlock,
                UreasePlank
        );
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new BlockItem(PyloriBlock, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
                        .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_block"))
        );

        event.getRegistry().registerAll(
                new BlockItem(PyloriPlank, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
                        .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_plank"))
        );

        event.getRegistry().registerAll(
                new BlockItem(UreaseBlock, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
                        .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_block"))
        );

        event.getRegistry().registerAll(
                new BlockItem(UreasePlank, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
                        .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_plank"))
        );
    }
}
