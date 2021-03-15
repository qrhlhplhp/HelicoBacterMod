package net.minecraft.client.renderer.model;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TexturedQuad {
   public PositionTextureVertex[] field_78239_a;
   public final int nVertices;
   private boolean invertNormal;

   public TexturedQuad(PositionTextureVertex[] vertices) {
      this.field_78239_a = vertices;
      this.nVertices = vertices.length;
   }

   public TexturedQuad(PositionTextureVertex[] vertices, int texcoordU1, int texcoordV1, int texcoordU2, int texcoordV2, float textureWidth, float textureHeight) {
      this(vertices);
      float f = 0.0F / textureWidth;
      float f1 = 0.0F / textureHeight;
      vertices[0] = vertices[0].setTexturePosition((float)texcoordU2 / textureWidth - f, (float)texcoordV1 / textureHeight + f1);
      vertices[1] = vertices[1].setTexturePosition((float)texcoordU1 / textureWidth + f, (float)texcoordV1 / textureHeight + f1);
      vertices[2] = vertices[2].setTexturePosition((float)texcoordU1 / textureWidth + f, (float)texcoordV2 / textureHeight - f1);
      vertices[3] = vertices[3].setTexturePosition((float)texcoordU2 / textureWidth - f, (float)texcoordV2 / textureHeight - f1);
   }

   public void flipFace() {
      PositionTextureVertex[] apositiontexturevertex = new PositionTextureVertex[this.field_78239_a.length];

      for(int i = 0; i < this.field_78239_a.length; ++i) {
         apositiontexturevertex[i] = this.field_78239_a[this.field_78239_a.length - i - 1];
      }

      this.field_78239_a = apositiontexturevertex;
   }

   /**
    * Draw this primitve. This is typically called only once as the generated drawing instructions are saved by the
    * renderer and reused later.
    */
   public void draw(BufferBuilder renderer, float scale) {
      Vec3d vec3d = this.field_78239_a[1].vector3D.subtractReverse(this.field_78239_a[0].vector3D);
      Vec3d vec3d1 = this.field_78239_a[1].vector3D.subtractReverse(this.field_78239_a[2].vector3D);
      Vec3d vec3d2 = vec3d1.crossProduct(vec3d).normalize();
      float f = (float)vec3d2.x;
      float f1 = (float)vec3d2.y;
      float f2 = (float)vec3d2.z;
      if (this.invertNormal) {
         f = -f;
         f1 = -f1;
         f2 = -f2;
      }

      renderer.begin(7, DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL);

      for(int i = 0; i < 4; ++i) {
         PositionTextureVertex positiontexturevertex = this.field_78239_a[i];
         renderer.pos(positiontexturevertex.vector3D.x * (double)scale, positiontexturevertex.vector3D.y * (double)scale, positiontexturevertex.vector3D.z * (double)scale).tex((double)positiontexturevertex.texturePositionX, (double)positiontexturevertex.texturePositionY).normal(f, f1, f2).endVertex();
      }

      Tessellator.getInstance().draw();
   }
}
