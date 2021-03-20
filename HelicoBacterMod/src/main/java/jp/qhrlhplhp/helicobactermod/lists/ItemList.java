package jp.qhrlhplhp.helicobactermod.lists;

import jp.qhrlhplhp.helicobactermod.HelicoBacterItemGroup;
import jp.qhrlhplhp.helicobactermod.HelicoBacterMod;
import jp.qhrlhplhp.helicobactermod.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HelicoBacterMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemList {

    public static Item UreasePylori = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_pylori"));

    public static Item Urease = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease"));

    public static Item Stomach = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "stomach"));

    public static Item FermentedStomach = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "fermented_stomach"));

    public static Item RottenStomach = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "rotten_stomach"));

    public static Item BreededStomach = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "breeded_stomach"));

    public static Item Pylori = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori"));

    public static Item PyloriLump = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_lump"));

    public static Item PyloriStick = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_stick"));

    public static Item PyloriIngot = new Item(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_ingot"));

    public static Item ItemPyloriAxe = new ItemPyloriAxe(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_axe"));

    public static Item ItemPyloriHoe = new ItemPyloriHoe(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_hoe"));

    public static Item ItemPyloriPickaxe = new ItemPyloriPickaxe(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_pickaxe"));

    public static Item ItemPyloriShovel = new ItemPyloriShovel(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_shovel"));

    public static Item ItemPyloriSword = new ItemPyloriSword(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_sword"));

    public static Item ItemUreaseAxe = new ItemUreaseAxe(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_axe"));

    public static Item ItemUreaseHoe = new ItemUreaseHoe(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_hoe"));

    public static Item ItemUreasePickaxe = new ItemUreasePickaxe(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_pickaxe"));

    public static Item ItemUreaseShovel = new ItemUreaseShovel(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_shovel"));

    public static Item ItemUreaseSword = new ItemUreaseSword(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_sword"));

    public static Item ItemGoldenPylori = new ItemGoldenPylori(new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "golden_pylori"));

    public static Item PyloriHelmet = new ArmorItem(PyloriArmorMaterial.PYLORI, EquipmentSlotType.HEAD, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_helmet"));

    public static Item PyloriChestplate = new ArmorItem(PyloriArmorMaterial.PYLORI, EquipmentSlotType.CHEST, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_chestplate"));

    public static Item PyloriLeggings = new ArmorItem(PyloriArmorMaterial.PYLORI, EquipmentSlotType.LEGS, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_leggings"));

    public static Item PyloriBoots = new ArmorItem(PyloriArmorMaterial.PYLORI, EquipmentSlotType.FEET, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "pylori_boots"));

    public static Item UreaseHelmet = new ArmorItem(UreaseArmorMaterial.UREASE, EquipmentSlotType.HEAD, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_helmet"));

    public static Item UreaseChestplate = new ArmorItem(UreaseArmorMaterial.UREASE, EquipmentSlotType.CHEST, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_chestplate"));

    public static Item UreaseLeggings = new ArmorItem(UreaseArmorMaterial.UREASE, EquipmentSlotType.LEGS, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_leggings"));

    public static Item UreaseBoots = new ArmorItem(UreaseArmorMaterial.UREASE, EquipmentSlotType.FEET, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "urease_boots"));

    public static Item MaskPylori = new ArmorItem(MaskArmorMaterial.MASK, EquipmentSlotType.HEAD, new Item.Properties().group(HelicoBacterItemGroup.DEFAULT))
            .setRegistryName(new ResourceLocation(HelicoBacterMod.MOD_ID, "mask_pylori"));


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                UreasePylori,
                Urease,
                Stomach,
                FermentedStomach,
                RottenStomach,
                BreededStomach,
                Pylori,
                PyloriLump,
                PyloriStick,
                PyloriIngot,
                ItemPyloriAxe,
                ItemPyloriHoe,
                ItemPyloriPickaxe,
                ItemPyloriShovel,
                ItemPyloriSword,
                ItemUreaseAxe,
                ItemUreaseHoe,
                ItemUreasePickaxe,
                ItemUreaseShovel,
                ItemUreaseSword,
                ItemGoldenPylori,
                PyloriHelmet,
                PyloriChestplate,
                PyloriLeggings,
                PyloriBoots,
                UreaseHelmet,
                UreaseChestplate,
                UreaseLeggings,
                UreaseBoots,
                MaskPylori

        );


    }


}

