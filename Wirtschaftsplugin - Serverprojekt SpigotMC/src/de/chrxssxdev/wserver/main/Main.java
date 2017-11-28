package de.chrxssxdev.wserver.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.chrxssxdev.wserver.listeners.JoinListener;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public Main() {
		instance = this;
	}
	
	public static Main getInstance() {
		return instance;
	}
	
	
	@Override
	public void onEnable() {
		loadConfig();
		registerCommands();
		registerListeners();
		loadConfig();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void registerListeners() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new JoinListener(this), this);
	}
	
	public void registerCommands() {

	}
	
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
		
	}

}
