package xyz.cyto.confusing.Listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BlockIterator;

public class BreakListeners implements Listener {
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		if(e.getPlayer().getInventory().getItemInOffHand() != new ItemStack(Material.AIR)) {
			BlockIterator iter = new BlockIterator(e.getPlayer(), 10);
			Block lastBlock = iter.next();
			Block c = lastBlock;
		    while (iter.hasNext()) {
		    	c = lastBlock;
		    	lastBlock = iter.next();		
		        if (lastBlock.getType() != Material.AIR) {
		            break;
		        } 
		    }
			ItemStack hb = e.getPlayer().getInventory().getItemInOffHand();
			int amount = hb.getAmount();
			c.setType(hb.getType());
			hb.setAmount(amount - 1);
		}
		e.setCancelled(true);
	}
}
