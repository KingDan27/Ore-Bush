package phoenix.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import phoenix.mod.init.ItemInit;

public class OreBushTab extends CreativeTabs {

	public OreBushTab(String label) {
		super("orebushtab");
		this.setBackgroundImageName("items.png");
	}
	
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.INGOT_COPPER);
		}
}
