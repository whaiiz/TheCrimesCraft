package pt.ganda.thecrimscraft.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6The CrimsCraft Help"));

        return true;
    }
}
