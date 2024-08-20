/*
 * This file is part of EnZasRenderGlitchPatchModForMinecraft - https://github.com/FlorianMichael/EnZasRenderGlitchPatchModForMinecraft
 * Copyright (C) 2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.textdisplayfix.mixin;

import net.minecraft.client.render.entity.DisplayEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(DisplayEntityRenderer.TextDisplayEntityRenderer.class)
public abstract class MixinDisplayEntityRenderer_TextDisplayEntityRenderer {

    @ModifyConstant(method = "render(Lnet/minecraft/entity/decoration/DisplayEntity$TextDisplayEntity;Lnet/minecraft/entity/decoration/DisplayEntity$TextDisplayEntity$Data;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IF)V", constant = @Constant(intValue = 9))
    private int fixHeight(int constant) {
        return constant - 1;
    }

}
