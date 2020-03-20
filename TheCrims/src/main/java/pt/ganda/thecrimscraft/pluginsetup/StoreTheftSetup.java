package pt.ganda.thecrimscraft.pluginsetup;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pt.ganda.thecrimscraft.configs.StoreTheftConfig;

public class StoreTheftSetup implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        double xCoord,yCoord,zCoord;

        if(args.length != 3){
            commandSender.sendMessage("Command format: /StoreTheftSetup <x> <y> <z>");
            return false;
        }

        try{
            xCoord = Double.parseDouble(args[0]);
            yCoord = Double.parseDouble(args[1]);
            zCoord = Double.parseDouble(args[2]);

        }catch(NumberFormatException e){
            commandSender.sendMessage("The coordinates must be a valid number!");
            return false;
        }

        World world =  Bukkit.getServer().getWorld("world");

        Location location = new Location(world,xCoord,yCoord,zCoord);
        StoreTheftConfig.setLocation(location);
        commandSender.sendMessage("StoreTheft set in x: " +xCoord + " y: " +yCoord + " z: "+zCoord);

        return true;
    }
}
