package tk.sandradev.nova.core.base

import nova.core.block.BlockManager
import nova.core.item.ItemManager
import nova.core.loader.Loadable
import nova.core.render.RenderManager

trait SandraModBase extends Loadable {
  val blocks: BlockManager
  val items: ItemManager
  val renders: RenderManager
  override def preInit() = {}
  override def init() = {}
  override def postInit() = {}
  def textureDomain : String
  def id : String
}
