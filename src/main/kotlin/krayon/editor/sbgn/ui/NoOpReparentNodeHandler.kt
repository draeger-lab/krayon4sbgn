/*
 * Copyright (c) 2018 Roland Wiese
 * This software is licensed under the Apache License, Version 2.0 (the "License"); you may not use this software except
 * in compliance with the License. You may obtain a copy of the License at  http://www.apache.org/licenses/LICENSE-2.0.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package krayon.editor.sbgn.ui

import com.yworks.yfiles.graph.INode
import com.yworks.yfiles.view.input.IInputModeContext
import com.yworks.yfiles.view.input.IReparentNodeHandler

class NoOpReparentNodeHandler : IReparentNodeHandler {
    override fun isReparentGesture(context: IInputModeContext, node: INode): Boolean {
        return true
    }

    override fun isValidParent(context: IInputModeContext, node: INode, newParent: INode?): Boolean {
        return true
    }

    override fun reparent(context: IInputModeContext?, node: INode, newParent: INode?) {

    }

    override fun shouldReparent(context: IInputModeContext, node: INode): Boolean {
        return true
    }
}

