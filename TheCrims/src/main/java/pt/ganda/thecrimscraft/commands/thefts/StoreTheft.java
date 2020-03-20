package pt.ganda.thecrimscraft.commands.thefts;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import pt.ganda.thecrimscraft.configs.StoreTheftConfig;

import java.util.Timer;
import java.util.TimerTask;

public class StoreTheft implements Theft {

    public int interval = 100;
    public static Timer timer = new Timer();
    public static int DELAY = 1000;
    public static int PERIOD = 1000;


    @Override
    public boolean onCommand(final CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;

        if(StoreTheftConfig.getLocation() == null){
            commandSender.sendMessage("You need to setup the TheftStore location first!");
            return false;
        }

        player.teleport(StoreTheftConfig.getLocation());

        player.sendMessage("&4The theft has started! Good Luck!");

        for(int i = 0 ; i < 4 ; i++) {
            player.getWorld().spawnEntity(StoreTheftConfig.getLocation(), EntityType.VINDICATOR);
        }

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                setInterval();

                if(interval % 5 == 0){ // run a away from the building and rob, rob went bad go to prision identificador é invalindo
                    commandSender.sendMessage("&3Time before cops come " +interval + " seconds.");
                }

            }
        }, DELAY, PERIOD);

        return true;

    }

    public int setInterval() {

        if (interval == 1)
            timer.cancel();
        return --interval;

    }
}
