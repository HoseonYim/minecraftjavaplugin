package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlyBoots implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // /flyboots
        if(label.equalsIgnoreCase("flyboots")){
            if(!(sender instanceof Player)){
                sender.sendMessage("Sorry console you're not allowed to use this command");
            }
            Player player = (Player) sender;
        }
        return false;
    }

    public ItemStack getItem(){
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = boots.getItemMeta();

        meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Boots of Leaping");
        

        return null;
    }
}
