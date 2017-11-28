package de.chrxssxdev.wserver.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.chrxssxdev.wserver.main.Main;
import de.chrxssxdev.wserver.utils.Strings;


public class JoinListener implements Listener {
	
	private Main instance;
	
	public JoinListener(Main instance) {
		this.instance = instance;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String msg = instance.getConfig().getString("Messages.Join");
		msg = ChatColor.translateAlternateColorCodes('&', msg);
		msg = msg.replace("%player%", p.getName());
		msg = msg.replace("[prefix]", Strings.pr);
		e.setJoinMessage(msg);

	}

}
