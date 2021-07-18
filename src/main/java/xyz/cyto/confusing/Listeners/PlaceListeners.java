package xyz.cyto.confusing.Listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceListeners implements Listener{
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		Block v = e.getBlockAgainst();
		v.breakNaturally();
		Block p = e.getBlockPlaced();
		p.setType(Material.AIR);
	}
}
