
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