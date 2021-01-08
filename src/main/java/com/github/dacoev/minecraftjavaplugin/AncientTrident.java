package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class AncientTrident extends JavaPlugin implements Listener {

    public List<String> list = new ArrayList<String>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("startool")){
            if(!(sender instanceof Player)){
                sender.sendMessage("Sorry console you're not allowed to use this command");
            }
            Player player = (Player) sender;
            if(player.getInventory().firstEmpty() == -1){
                //inventory is full
                Location loc = player.getLocation();
                World world = player.getWorld();

                world.dropItemNaturally(loc, getItem());
                player.sendMessage(ChatColor.GOLD + "The Minecraft Legends dropped a gift near you.");
            }
            player.getInventory().addItem(getItem());
            player.sendMessage(ChatColor.GOLD + "The Minecraft Legends gave you a gift");
            return true;
        }
        return false;
    }

    public ItemStack getItem(){
        ItemStack item = new ItemStack(Material.TRIDENT);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Ancient Trident");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7(Right Click) &a&oSpawn minions"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7(Left Click) &a&oShoot explosives"));
        meta.setLore(lore);

        meta.addEnchant(Enchantment.LOYALTY, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setUnbreakable(true);

        item.setItemMeta(meta);

        return item;
    }

    @EventHandler
    public void onClick(PlayerInteractEvent event){
        if(event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.TRIDENT))
            if(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Ancient Trident"))
                if(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore()){
                    Player player = (Player) event.getPlayer()
                    if(event.getAction() == Action.RIGHT_CLICK_AIR){
                        if
                    }
                    if (event.getAction() == Action.LEFT_CLICK_AIR){
                        player.launchProjectile(Fireball.class);
                    }
                }
    }
}
