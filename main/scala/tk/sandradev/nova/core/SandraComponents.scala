package tk.sandradev.nova.core

import nova.core.block.{BlockManager, Block}
import nova.core.item.{ItemManager, Item}
import nova.core.loader.NovaMod
import nova.core.recipes.crafting.CraftingRecipeManager
import nova.core.render.RenderManager
import tk.sandradev.nova.core.base.SandraModBase
import tk.sandradev.nova.core.util.RegisterUtil

@NovaMod(id="SandraComponents", name="Sandra's Awesome Components", version="0.1.0", novaVersion="0.0.1")
class SandraComponents(val blocks: BlockManager, val items: ItemManager, val renders: RenderManager, val crafting: CraftingRecipeManager) extends SandraModBase {
  def id = "SandraComponents"
  def textureDomain = "sandracomponents"
  var ingotImpureAwesomeite: Item = null
  var ingotPureAwesomeite: Item = null
  var dustImpureAwesomeite: Item = null

  var dustPureAwesomeite: Item = null
  var flour: Item = null
  var nuggetImpureAwesomeite: Item = null
  var blockImpureAwesomeite: Block = null
  var nuggetPureAwesomeite: Item = null
  var blockPureAwesomeite: Block = null
  var awesomeCore: Block = null
  var awesomeiteHammer: Item = null

  override def preInit() = {
    super.preInit()
    ingotImpureAwesomeite = RegisterUtil.registerItem(this, "ingotImpureAwesomeite")
    ingotPureAwesomeite = RegisterUtil.registerItem(this, "ingotPureAwesomeite")
    dustImpureAwesomeite = RegisterUtil.registerItem(this, "dustImpureAwesomeite")
    dustPureAwesomeite = RegisterUtil.registerItem(this, "dustPureAwesomeite")
    flour = RegisterUtil.registerItem(this, "flour")
    nuggetImpureAwesomeite = RegisterUtil.registerItem(this, "nuggetImpureAwesomeite")
    blockImpureAwesomeite = RegisterUtil.registerBlock(this, "blockImpureAwesomeite")
    nuggetPureAwesomeite = RegisterUtil.registerItem(this, "nuggetPureAwesomeite")
    blockPureAwesomeite = RegisterUtil.registerBlock(this, "blockPureAwesomeite")
    awesomeCore = RegisterUtil.registerBlock(this, "awesomeCore")
    awesomeiteHammer = RegisterUtil.registerItem(this, "awesomeiteHammer")
  }
  override def init() = { super.init()
    crafting.addRecipe()
  }
  override def postInit() = { super.postInit()}
}
