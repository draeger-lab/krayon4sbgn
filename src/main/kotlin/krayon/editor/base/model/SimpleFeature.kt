/*
 * Copyright (c) 2018 Roland Wiese
 * This software is licensed under the Apache License, Version 2.0 (the "License"); you may not use this software except
 * in compliance with the License. You may obtain a copy of the License at  http://www.apache.org/licenses/LICENSE-2.0.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package krayon.editor.base.model

import com.yworks.yfiles.graph.IModelItem
import krayon.editor.base.style.IStyleable

open class SimpleFeature(override var owner: IModelItem?) : IModelItemFeature {

    override var style: IStyleable? = null

    override fun setTag(tag: Any?) {
        this.tag = tag
    }

    override fun getTag(): Any? {
        return tag
    }

    private var tag:Any? = null

    override fun <T : Any?> lookup(p0: Class<T>?): T? {
        return null
    }
}