package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(label.equalsIgnoreCase("launch") || label.equalsIgnoreCase("lch")){
            if(sender instanceof Player){//only player could use this command
                Player player = (Player) sender;
                //There are two commands that we could use which is /launch and /launch <number>
                if(args.length == 0){
                    //using /launch
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Zooooom!");
                    player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
                    return true;
                }
                //using /launch <number>
                if(isNum(args[0])){//if <number>'s type is int
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Zooooom!");
                    player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));
                }
                else{//if <number>'s type is not int
                    player.sendMessage(ChatColor.RED + "Usage : /launch <number-value>");
                }

                return true;
            }else{//console couldn't use this command
                sender.sendMessage("console could not use this command");
                return true;
            }
        }
        return false;
    }

    //This is trying to see when peoples use /launch <number> if the <number>'s type is not int
    public boolean isNum(String num){
        try{
            Integer.parseInt(num);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

}
