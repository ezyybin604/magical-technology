
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

let egg_colors = ["red", "green", "bronze", "gray", "blue", "white", "sapphire", "silver", "electric", "amythest", "copper", "black"]

// Pulled from server_scripts
let mystical_colors = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"]

console.log("This")
WorldgenEvents.remove(event => {
    event.removeFeatureById('vegetal_decoration', ['botania:mystical_flowers'])
    event.removeFeatureById('vegetal_decoration', ['botania:mystical_mushrooms'])
})
StartupEvents.registry('item', event => {
    for (let i=0;i<egg_colors.length;i++) {
        event.create('broken_{0}_dragon_egg'.format(egg_colors[i])).texture('iceandfire:item/dragonegg_{0}'.format(egg_colors[i]))
    }
})

StartupEvents.registry('block', event => {
  for (let i=0;i<mystical_colors.length;i++) {
    console.log("ChickenNugget: " + i.toString())
    event.create('dead_mystical_{0}_flower'.format(mystical_colors[i]))
      .noCollision()
      .mapColor(mystical_colors[i].toLowerCase())
      .soundType("grass")
      .hardness(0)
      .model('kubejs:deadflower/' + mystical_colors[i].toLowerCase())
      .renderType('cutout')
  }
})

// I hope KubeJS adds support for whitelisting/blacklisting the blocks under because i hate this.
/*for (let i=0;i<mystical_colors.length;i++) {
  BlockEvents.placed('kubejs:deaed_mystical_{0}_flower'.format(mystical_colors[i]), event => {
    event.block.set('minecraft:oak_log')
  })
}*/

ItemEvents.modification(event => {
  event.modify('minecraft:wooden_pickaxe', item => {
      item.maxDamage = 1;
  })
  event.modify('minecraft:stone_pickaxe', item => {
      item.maxDamage = 1;
  })
  event.modify('minecraft:iron_pickaxe', item => {
    item.maxDamage = 1;
  })
  event.modify('minecraft:diamond_pickaxe', item => {
      item.maxDamage = 1;
  })
  event.modify('minecraft:golden_pickaxe', item => {
    item.maxDamage = 1;
  })
  event.modify('immersiveweapons:copper_pickaxe', item => {
      item.maxDamage = 1;
  })
  event.modify('iceandfire:copper_pickaxe', item => {
    item.maxDamage = 1;
  })
})