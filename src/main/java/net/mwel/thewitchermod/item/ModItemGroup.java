package net.mwel.thewitchermod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup{

    public static final ItemGroup THE_WITCHER = FabricItemGroupBuilder.create(
                    new Identifier("thewitchermod", "general"))
            .icon(() -> new ItemStack(ModItems.amethyst)).appendItems(stacks -> {
//            Components
                stacks.add(new ItemStack(ModItems.acid_extract));
                stacks.add(new ItemStack(ModItems.amber));
                stacks.add(new ItemStack(ModItems.amber_dust));
                stacks.add(new ItemStack(ModItems.amber_fragment));
                stacks.add(new ItemStack(ModItems.amethyst));
                stacks.add(new ItemStack(ModItems.amethyst_dust));
                stacks.add(new ItemStack(ModItems.azurite));
                stacks.add(new ItemStack(ModItems.black_pearl));
                stacks.add(new ItemStack(ModItems.black_pearl_dust));
                stacks.add(new ItemStack(ModItems.chitinous_shell));
                stacks.add(new ItemStack(ModItems.copper_plate));
                stacks.add(new ItemStack(ModItems.cotton));
                stacks.add(new ItemStack(ModItems.cupronickel_ore));
                stacks.add(new ItemStack(ModItems.cured_draconid_leather));
                stacks.add(new ItemStack(ModItems.cured_leather));
                stacks.add(new ItemStack(ModItems.dark_iron_ingot));
                stacks.add(new ItemStack(ModItems.dark_iron_ore));
                stacks.add(new ItemStack(ModItems.dark_iron_plate));
                stacks.add(new ItemStack(ModItems.dark_steel_ingot));
                stacks.add(new ItemStack(ModItems.dark_steel_plate));
                stacks.add(new ItemStack(ModItems.diamond_dust));
                stacks.add(new ItemStack(ModItems.dimeritium_ingot));
                stacks.add(new ItemStack(ModItems.dimeritium_ore));
                stacks.add(new ItemStack(ModItems.dimeritium_plate));
                stacks.add(new ItemStack(ModItems.dragon_scales));
                stacks.add(new ItemStack(ModItems.dwarven_armorers_tools));
                stacks.add(new ItemStack(ModItems.dwarven_whetstone));
                stacks.add(new ItemStack(ModItems.dye));
                stacks.add(new ItemStack(ModItems.dye_solution));
                stacks.add(new ItemStack(ModItems.elven_armorers_tools));
                stacks.add(new ItemStack(ModItems.elven_whetstone));
                stacks.add(new ItemStack(ModItems.emerald_dust));
                stacks.add(new ItemStack(ModItems.endrega_armor_plate));
                stacks.add(new ItemStack(ModItems.enriched_dimeritium_ingot));
                stacks.add(new ItemStack(ModItems.enriched_dimeritium_ore));
                stacks.add(new ItemStack(ModItems.enriched_dimeritium_plate));
                stacks.add(new ItemStack(ModItems.fiber));
                stacks.add(new ItemStack(ModItems.flawless_amber));
                stacks.add(new ItemStack(ModItems.flawless_amethyst));
                stacks.add(new ItemStack(ModItems.flawless_diamond));
                stacks.add(new ItemStack(ModItems.flawless_emerald));
                stacks.add(new ItemStack(ModItems.flawless_ruby));
                stacks.add(new ItemStack(ModItems.flawless_sapphire));
                stacks.add(new ItemStack(ModItems.fur_scrap));
                stacks.add(new ItemStack(ModItems.glowing_ingot));
                stacks.add(new ItemStack(ModItems.glowing_ore));
                stacks.add(new ItemStack(ModItems.gnomish_armorers_tools));
                stacks.add(new ItemStack(ModItems.gnomish_whetstone));
                stacks.add(new ItemStack(ModItems.green_gold_dust));
                stacks.add(new ItemStack(ModItems.green_gold_ingot));
                stacks.add(new ItemStack(ModItems.green_gold_ore));
                stacks.add(new ItemStack(ModItems.green_gold_plate));
                stacks.add(new ItemStack(ModItems.hardened_leather));
                stacks.add(new ItemStack(ModItems.hardened_timber));
                stacks.add(new ItemStack(ModItems.hunk_of_nickel));
                stacks.add(new ItemStack(ModItems.infused_crystal));
                stacks.add(new ItemStack(ModItems.infused_dust));
                stacks.add(new ItemStack(ModItems.infused_shard));
                stacks.add(new ItemStack(ModItems.infused_slyzard_hide));
                stacks.add(new ItemStack(ModItems.leather_scraps));
                stacks.add(new ItemStack(ModItems.leather_straps));
                stacks.add(new ItemStack(ModItems.linen));
                stacks.add(new ItemStack(ModItems.malachite));
                stacks.add(new ItemStack(ModItems.meteorite_ingot));
                stacks.add(new ItemStack(ModItems.meteorite_ore));
                stacks.add(new ItemStack(ModItems.meteorite_silver_ingot));
                stacks.add(new ItemStack(ModItems.meteorite_silver_plate));
                stacks.add(new ItemStack(ModItems.monster_blood));
                stacks.add(new ItemStack(ModItems.monster_bone));
                stacks.add(new ItemStack(ModItems.monster_brain));
                stacks.add(new ItemStack(ModItems.monster_carapace));
                stacks.add(new ItemStack(ModItems.monster_claw));
                stacks.add(new ItemStack(ModItems.monster_ear));
                stacks.add(new ItemStack(ModItems.monster_egg));
                stacks.add(new ItemStack(ModItems.monster_essence));
                stacks.add(new ItemStack(ModItems.monster_eye));
                stacks.add(new ItemStack(ModItems.monster_feather));
                stacks.add(new ItemStack(ModItems.monster_hair));
                stacks.add(new ItemStack(ModItems.monster_heart));
                stacks.add(new ItemStack(ModItems.monster_hide));
                stacks.add(new ItemStack(ModItems.monster_liver));
                stacks.add(new ItemStack(ModItems.monster_pincer));
                stacks.add(new ItemStack(ModItems.monster_saliva));
                stacks.add(new ItemStack(ModItems.monster_spore));
                stacks.add(new ItemStack(ModItems.monster_stomach));
                stacks.add(new ItemStack(ModItems.monster_tongue));
                stacks.add(new ItemStack(ModItems.monster_tooth));
                stacks.add(new ItemStack(ModItems.monster_vine));
                stacks.add(new ItemStack(ModItems.monster_wing));
                stacks.add(new ItemStack(ModItems.nails));
                stacks.add(new ItemStack(ModItems.nickel_ore));
                stacks.add(new ItemStack(ModItems.oil));
                stacks.add(new ItemStack(ModItems.orichalcum_dust));
                stacks.add(new ItemStack(ModItems.orichalcum_ingot));
                stacks.add(new ItemStack(ModItems.orichalcum_ore));
                stacks.add(new ItemStack(ModItems.orichalcum_plate));
                stacks.add(new ItemStack(ModItems.pearl));
                stacks.add(new ItemStack(ModItems.powdered_monster_tissue));
                stacks.add(new ItemStack(ModItems.powdered_pearl));
                stacks.add(new ItemStack(ModItems.resin));
                stacks.add(new ItemStack(ModItems.rope));
                stacks.add(new ItemStack(ModItems.ruby));
                stacks.add(new ItemStack(ModItems.ruby_dust));
                stacks.add(new ItemStack(ModItems.sap));
                stacks.add(new ItemStack(ModItems.sapphire));
                stacks.add(new ItemStack(ModItems.sapphire_dust));
                stacks.add(new ItemStack(ModItems.silk));
                stacks.add(new ItemStack(ModItems.silver_dust));
                stacks.add(new ItemStack(ModItems.silver_ingot));
                stacks.add(new ItemStack(ModItems.silver_ore));
                stacks.add(new ItemStack(ModItems.silver_plate));
                stacks.add(new ItemStack(ModItems.siren_vocal_cords));
                stacks.add(new ItemStack(ModItems.steel_ingot));
                stacks.add(new ItemStack(ModItems.steel_line));
                stacks.add(new ItemStack(ModItems.steel_plate));
                stacks.add(new ItemStack(ModItems.thread));
                stacks.add(new ItemStack(ModItems.timber));
                stacks.add(new ItemStack(ModItems.twine));
                stacks.add(new ItemStack(ModItems.unrefined_copper_ore));
                stacks.add(new ItemStack(ModItems.venom_extract));
                stacks.add(new ItemStack(ModItems.wax));
                stacks.add(new ItemStack(ModItems.wire));
                stacks.add(new ItemStack(ModItems.zerrikanian_powder));

                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);
                stacks.add(ItemStack.EMPTY);

//                Ingredients
                stacks.add(new ItemStack(ModItems.acid_archespore_juice));
                stacks.add(new ItemStack(ModItems.aether));
                stacks.add(new ItemStack(ModItems.albedo));
                stacks.add(new ItemStack(ModItems.alchemists_powder));
                stacks.add(new ItemStack(ModItems.alchemy_paste));
                stacks.add(new ItemStack(ModItems.alcohest));
                stacks.add(new ItemStack(ModItems.alghoul_bone_marrow));
                stacks.add(new ItemStack(ModItems.alghoul_claw));
                stacks.add(new ItemStack(ModItems.allspice));
                stacks.add(new ItemStack(ModItems.arachas_eyes));
                stacks.add(new ItemStack(ModItems.arachas_venom));
                stacks.add(new ItemStack(ModItems.archespore_tendril));
                stacks.add(new ItemStack(ModItems.arenaria));
                stacks.add(new ItemStack(ModItems.balisse_fruit));
                stacks.add(new ItemStack(ModItems.barghest_essence));
                stacks.add(new ItemStack(ModItems.basilisk_hide));
                stacks.add(new ItemStack(ModItems.basilisk_venom));
                stacks.add(new ItemStack(ModItems.bear_fat));
                stacks.add(new ItemStack(ModItems.beggartick_blossoms));
                stacks.add(new ItemStack(ModItems.berbercane_fruit));
                stacks.add(new ItemStack(ModItems.berserker_hide));
                stacks.add(new ItemStack(ModItems.bison_grass));
                stacks.add(new ItemStack(ModItems.bloodmoss));
                stacks.add(new ItemStack(ModItems.blowball));
                stacks.add(new ItemStack(ModItems.blue_lotus_flower));
                stacks.add(new ItemStack(ModItems.bryonia));
                stacks.add(new ItemStack(ModItems.buckthorn));
                stacks.add(new ItemStack(ModItems.calcium_equum));
                stacks.add(new ItemStack(ModItems.cave_troll_liver));
                stacks.add(new ItemStack(ModItems.celandine));
                stacks.add(new ItemStack(ModItems.cherry_cordial));
                stacks.add(new ItemStack(ModItems.chort_hide));
                stacks.add(new ItemStack(ModItems.cockatrice_egg));
                stacks.add(new ItemStack(ModItems.cockatrice_stomach));
                stacks.add(new ItemStack(ModItems.cortinarius));
                stacks.add(new ItemStack(ModItems.crows_eye));
                stacks.add(new ItemStack(ModItems.crystalized_essence));
                stacks.add(new ItemStack(ModItems.cyclops_eye));
                stacks.add(new ItemStack(ModItems.dark_essence));
                stacks.add(new ItemStack(ModItems.devourers_blood));
                stacks.add(new ItemStack(ModItems.dog_tallow));
                stacks.add(new ItemStack(ModItems.drowner_brain));
                stacks.add(new ItemStack(ModItems.drowner_tongue));
                stacks.add(new ItemStack(ModItems.ducal_water));
                stacks.add(new ItemStack(ModItems.dwarven_spirit));
                stacks.add(new ItemStack(ModItems.ekimmara_hide));
                stacks.add(new ItemStack(ModItems.elemental_essence));
                stacks.add(new ItemStack(ModItems.endrega_embryo));
                stacks.add(new ItemStack(ModItems.endrega_heart));
                stacks.add(new ItemStack(ModItems.ergot_seeds));
                stacks.add(new ItemStack(ModItems.erynia_eye));
                stacks.add(new ItemStack(ModItems.essence_of_wraith));
                stacks.add(new ItemStack(ModItems.fiends_eye));
                stacks.add(new ItemStack(ModItems.fifth_essence));
                stacks.add(new ItemStack(ModItems.foglet_teeth));
                stacks.add(new ItemStack(ModItems.fools_parsley_leaves));
                stacks.add(new ItemStack(ModItems.forktail_hide));
                stacks.add(new ItemStack(ModItems.gargoyle_dust));
                stacks.add(new ItemStack(ModItems.gargoyle_heart));
                stacks.add(new ItemStack(ModItems.ghouls_blood));
                stacks.add(new ItemStack(ModItems.giant_centipede_discharge));
                stacks.add(new ItemStack(ModItems.giant_centipede_mandible));
                stacks.add(new ItemStack(ModItems.ginatia_petals));
                stacks.add(new ItemStack(ModItems.golems_heart));
                stacks.add(new ItemStack(ModItems.grave_hags_ear));
                stacks.add(new ItemStack(ModItems.green_mold));
                stacks.add(new ItemStack(ModItems.griffin_feathers));
                stacks.add(new ItemStack(ModItems.griffins_egg));
                stacks.add(new ItemStack(ModItems.han_fiber));
                stacks.add(new ItemStack(ModItems.harpy_eggs));
                stacks.add(new ItemStack(ModItems.harpy_feathers));
                stacks.add(new ItemStack(ModItems.harpy_talons));
                stacks.add(new ItemStack(ModItems.hellebore_petals));
                stacks.add(new ItemStack(ModItems.honeysuckle));
                stacks.add(new ItemStack(ModItems.hop_umbels));
                stacks.add(new ItemStack(ModItems.hornwort));
                stacks.add(new ItemStack(ModItems.hydragenum));
                stacks.add(new ItemStack(ModItems.kikimore_discharge));
                stacks.add(new ItemStack(ModItems.leshen_resin));
                stacks.add(new ItemStack(ModItems.light_essence));
                stacks.add(new ItemStack(ModItems.lock_of_lamia_hair));
                stacks.add(new ItemStack(ModItems.longrube));
                stacks.add(new ItemStack(ModItems.lunar_shards));
                stacks.add(new ItemStack(ModItems.mahakaman_spirit));
                stacks.add(new ItemStack(ModItems.mandrake_cordial));
                stacks.add(new ItemStack(ModItems.mandrake_root));
                stacks.add(new ItemStack(ModItems.mistletoe));
                stacks.add(new ItemStack(ModItems.moleyarrow));
                stacks.add(new ItemStack(ModItems.nazairi_basil));
                stacks.add(new ItemStack(ModItems.necrophage_hide));
                stacks.add(new ItemStack(ModItems.nekker_blood));
                stacks.add(new ItemStack(ModItems.nekker_claws));
                stacks.add(new ItemStack(ModItems.nekker_eye));
                stacks.add(new ItemStack(ModItems.nekker_heart));
                stacks.add(new ItemStack(ModItems.nekker_warrior_liver));
                stacks.add(new ItemStack(ModItems.nightwraith_hair));
                stacks.add(new ItemStack(ModItems.nigredo));
                stacks.add(new ItemStack(ModItems.nilfgaardian_lemon));
                stacks.add(new ItemStack(ModItems.nostrix));
                stacks.add(new ItemStack(ModItems.optima_mater));
                stacks.add(new ItemStack(ModItems.phosphorus));
                stacks.add(new ItemStack(ModItems.pringrape));
                stacks.add(new ItemStack(ModItems.puffball));
                stacks.add(new ItemStack(ModItems.quebrith));
                stacks.add(new ItemStack(ModItems.quicksilver_solution));
                stacks.add(new ItemStack(ModItems.ranogrin));
                stacks.add(new ItemStack(ModItems.rebis));
                stacks.add(new ItemStack(ModItems.redanian_herbal));
                stacks.add(new ItemStack(ModItems.ribleaf));
                stacks.add(new ItemStack(ModItems.rotfiend_blood));
                stacks.add(new ItemStack(ModItems.rubedo));
                stacks.add(new ItemStack(ModItems.saltpeter));
                stacks.add(new ItemStack(ModItems.sewant_mushrooms));
                stacks.add(new ItemStack(ModItems.shaelmaar_dust));
                stacks.add(new ItemStack(ModItems.shaelmaar_hair));
                stacks.add(new ItemStack(ModItems.slyzard_scale_plate));
                stacks.add(new ItemStack(ModItems.specter_dust));
                stacks.add(new ItemStack(ModItems.stammelfords_dust));
                stacks.add(new ItemStack(ModItems.sulfur));
                stacks.add(new ItemStack(ModItems.troll_hide));
                stacks.add(new ItemStack(ModItems.vampire_blood));
                stacks.add(new ItemStack(ModItems.vampire_fang));
                stacks.add(new ItemStack(ModItems.vampire_saliva));
                stacks.add(new ItemStack(ModItems.verbena));
                stacks.add(new ItemStack(ModItems.vermilion));
                stacks.add(new ItemStack(ModItems.vitriol));
                stacks.add(new ItemStack(ModItems.water_essence));
                stacks.add(new ItemStack(ModItems.water_hag_tooth));
                stacks.add(new ItemStack(ModItems.werewolf_hide));
                stacks.add(new ItemStack(ModItems.werewolf_saliva));
                stacks.add(new ItemStack(ModItems.white_gull));
                stacks.add(new ItemStack(ModItems.white_myrtle_petals));
                stacks.add(new ItemStack(ModItems.wight_ear));
                stacks.add(new ItemStack(ModItems.wight_hair));
                stacks.add(new ItemStack(ModItems.wine_stone));
                stacks.add(new ItemStack(ModItems.winter_cherry));
                stacks.add(new ItemStack(ModItems.wolfs_liver));
                stacks.add(new ItemStack(ModItems.wolfsbane));
                stacks.add(new ItemStack(ModItems.wyvern_egg));
                stacks.add(new ItemStack(ModItems.wyvern_hide));
//                stacks.add(new ItemStack(ModItems.mutagen_blue));
//                stacks.add(new ItemStack(ModItems.mutagen_blue_greater));
//                stacks.add(new ItemStack(ModItems.mutagen_blue_lesser));
//                stacks.add(new ItemStack(ModItems.mutagen_blue_unique));
//                stacks.add(new ItemStack(ModItems.mutagen_green));
//                stacks.add(new ItemStack(ModItems.mutagen_green_greater));
//                stacks.add(new ItemStack(ModItems.mutagen_green_lesser));
//                stacks.add(new ItemStack(ModItems.mutagen_green_unique));
//                stacks.add(new ItemStack(ModItems.mutagen_red));
//                stacks.add(new ItemStack(ModItems.mutagen_red_greater));
//                stacks.add(new ItemStack(ModItems.mutagen_red_lesser));
//                stacks.add(new ItemStack(ModItems.mutagen_red_unique));
            })
            .build();


    }

