package jp.qhrlhplhp.helicobactermod;

import jp.qhrlhplhp.helicobactermod.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HelicoBacterItemGroup extends ItemGroup {
    public static final HelicoBacterItemGroup DEFAULT = new HelicoBacterItemGroup();

    public HelicoBacterItemGroup() {
        super("helicobactermod");
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack createIcon() {
        return new ItemStack(ItemList.Pylori);
    }
}