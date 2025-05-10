// priority: 0

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

    event.remove({ id: 'create:crafting/materials/andesite_alloy' })
    event.remove({ id: 'create:crafting/materials/andesite_alloy_from_zinc' })
    event.remove({ id: 'create:mixing/andesite_alloy' })
    event.remove({ id: 'create:mixing/andesite_alloy_from_zinc' })
})