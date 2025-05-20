// priority: 0

if (!String.prototype.format) {
String.prototype.format = function() {
    var args = arguments;
    return this.replace(/{(\d+)}/g, function(match, number) { 
    return typeof args[number] != 'undefined'
        ? args[number]
        : match
    ;
    });
};
}

// Base off of startup_scripts
let egg_colors = ["red", "green", "bronze", "gray", "blue", "white", "sapphire", "silver", "electric", "amythest", "copper", "black"]

// Visit the wiki for more info - https://kubejs.com/

console.info('Server Scripts: The Logging:') // tried using mcreator to overwrite the diamond recipes but mcreator was being fussy

LootJS.modifiers((event) => {
    event.addLootTableModifier("twilightforest:entities/giant_miner")
        .addWeightedLoot(24, [Item.of("magicaltech:end_dust")])
    event.addEntityLootModifier("minecraft:iron_golem").removeLoot(Ingredient.all);
});

ServerEvents.recipes(event => {
    // just realized i could just use the data folder but i dont care
    console.log('Hello! The recipe event has fired!');

    let mystical_colors = ["white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "lightgray", "cyan", "purple", "blue", "brown", "green", "red", "black"]
    for (let i=0;i<mystical_colors.length;i++) {
        event.custom({
            "type": "create_new_age:energising",
            "energy_needed": 30000,
            "ingredients": [{"item": "magicaltech:dead_" + mystical_colors[i] + "_flower"}],
            "results": [{"item": "botania:" + mystical_colors[i] + "_mystical_flower"}]
        })
    }
    for (let i=0;i<egg_colors.length;i++) {
        //event.create('broken_{0}_dragon_egg'.format(egg_colors[i])).texture('iceandfire:item/dragonegg_{0}'.format(egg_colors[i]))
        console.log('iceandfire:dragonegg_{0}'.format(egg_colors[i]))
        event.shapeless(
            Item.of('iceandfire:dragonegg_{0}'.format(egg_colors[i]), 1), // arg 1: output
            [
                'minecraft:dragon_egg',
                'iceandfire:dragon_meal',
                'kubejs:broken_{0}_dragon_egg'.format(egg_colors[i])
            ]
        );
    }

    event.remove({ id: 'create:crafting/materials/andesite_alloy' })
    event.remove({ id: 'create:crafting/materials/andesite_alloy_from_zinc' })
    event.remove({ id: 'create:mixing/andesite_alloy' })
    event.remove({ id: 'create:mixing/andesite_alloy_from_zinc' })
    event.remove({ id: 'tconstruct:smeltery/casting/ender/eye'})

    //event.remove({ id: 'tconstruct:smeltery/casting/diamond/gem_sand_cast'})
    //event.remove({ id: 'tconstruct:smeltery/casting/diamond/gem_gold_cast'})
    event.remove({ id: 'tconstruct:smeltery/casting/diamond/block'})
})