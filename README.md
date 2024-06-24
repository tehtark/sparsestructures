# <img src="media/icon_small.png" width="128" title="Sparse Structs Icon" style="vertical-align: middle"> Sparse Structures
A simple and configurable mod that makes all (even datapacks and modded) structures more spread out (or more common!), essentially making them rarer/easier to find. Useful in big modpacks with a lot of structures mod to encourage exploration and make the experience more challenging or balanced.

> Notice: this does not alter the generation of ores/geodes or other features of this kind, and alters very slightly the terrain and trees (not enough to be an issue to most players).

## Examples
![Comparison between two world on the same seed, the one on the left showing a witch hut and a mansion (without the mod), the one on the right showing the same terrain but without those structures](media/example1.png)

### In a modded environment:
![First screenshot of the comparison, showing many (maybe too many) structures at once in the ocean because of the quantity of structure mods installed.](media/example2_1.png)
![Second screenshot of the comparison, showing lot less structures in the same world (seed), at the same coordinates.](media/example2_2.png)
<details><summary>Structure Mods in the picture :</summary>
Tidal towns, Explorify, all Yung's mods, Just Another Structure Pack, MVS, Explorations, Towns and Towers, Dungeons and Taverns...
</details>

## Features
* **Configurable** : you can change the rarity of all individual structures, even from mods and datapacks.
* **MC-177381 fix** : fixes the bug where `/locate` returns an incorrect distance between the player and the structure.
* **Dump Structure Sets** : you can dump all structure sets to a file in the right format for the config using `/dumpstructuresets`.
* **No separation limit** : In vanilla, the separation between structures is limited to 4096 chunks (65k blocks). This mod removes this limit, allowing structures to be even more spread out (if for any reason you need structures to be that rare).

## Configuration
The config can be found in the `config` folder of your instance, and is named `sparsestructures.json5`. It contains the following options :
* `spreadFactor` : the factor by which the separation and spacing of structures should be multiplied. The default value is `2`, which means that structures will be twice as rare. If you want structures to be more common, you can set this value to `0.5` for example.
    * ⚠️ **Warning** : a very low value (like `0.01`) makes the world generation process considerably slower (and your world will become filled with overlapping structures).
* `customSpreadFactors` : a list of custom spread factors for specific structures. The default value makes the mansion twice as rare as an example (which has no effects with a global `spreadFactor` of 2). If you want to change the spread factor of a structure, you can add an entry to this list. Each entry is a JSON object with two fields : `name` (the name of the structure) and `spreadFactor` (the spread factor of the structure). Here's an example :
```json5
{
    "name": "minecraft:mansion",
    "spreadFactor": 2
}
// More detailed info can be found inside the config file
```
> Tip: you can dump all structure sets to a file in the right format by using the custom command `/dumpstructuresets`

For now, you have to restart the game for the config to be reloaded. This behavior may change in the future.

## Dependencies
Fabric API (if you're using Fabric, or use the Quilt equivalent)

## Future Updates
* Ban specific structures from generating
* World-specific configs
* Support for frequency-based structure generation
* Support for structure tags in the config
* *Open an issue on this project's repo if you have any suggestion!*
* *~~Add a config~~* (added in v2.0)

## Credits
Icon made with [Gimp](https://www.gimp.org/) using [Twemoji](https://github.com/twitter/twemoji) and [FiraCode](https://github.com/tonsky/FiraCode)  
[Multiloader Template](https://github.com/jaredlll08/MultiLoader-Template) by jaredlll08