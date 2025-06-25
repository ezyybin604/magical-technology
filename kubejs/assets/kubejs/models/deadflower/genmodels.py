mc = ["white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"]
for x in mc:
	with open(x + ".json", "w") as file:
		file.write("""{
	"parent": "minecraft:block/cross",
	"textures":{"cross":"kubejs:block/mystical_{}_dead"}}""".replace("{}", x))
