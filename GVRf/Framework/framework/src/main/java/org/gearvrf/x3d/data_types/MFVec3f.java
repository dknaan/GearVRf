/* Copyright 2016 Samsung Electronics Co., LTD
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gearvrf.x3d.data_types;

/**
 * Defines the X3D MFVec3f data type
 */
public class MFVec3f {

    private float[] vals = null;

    public MFVec3f() {
    }

    public MFVec3f(float[] newVals) {
        this.vals = new float[newVals.length];
        setValue(newVals);
    }

    public int getValueCount() {
        return this.vals.length;
    }

    public float[] getValueData() {
        return vals;
    }

    public void setValue(float[] newVals) {
        for (int i = 0; i < this.vals.length; i++) {
            this.vals[i] = newVals[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < this.vals.length; i++) {
            buf.append(this.vals[i]);
            buf.append(' ');
        }
        return buf.toString();
    }

}



