package xyz.cyto.confusing;

import org.bukkit.plugin.java.JavaPlugin;

import xyz.cyto.confusing.Listeners.BreakListeners;
import xyz.cyto.confusing.Listeners.PlaceListeners;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlaceListeners(), this);
		getServer().getPluginManager().registerEvents(new BreakListeners(), this);
	}
	
	public void onDisable() {
		
	}
}
