/*
 * WekaDeeplearning4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WekaDeeplearning4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WekaDeeplearning4j.  If not, see <https://www.gnu.org/licenses/>.
 *
 * CustomNet.java
 * Copyright (C) 2017-2018 University of Waikato, Hamilton, New Zealand
 */

package weka.dl4j.zoo;

import org.deeplearning4j.nn.graph.ComputationGraph;

/**
 * A dummy ZooModel which is empty.
 *
 * @author Steven Lang
 */
public class CustomNet implements ZooModel {
    private static final long serialVersionUID = 7131900848379752732L;

    @Override
    public ComputationGraph init(int numLabels, long seed, int[] shape)
            throws UnsupportedOperationException {
        throw new UnsupportedOperationException(
                "This model cannot be initialized as a MultiLayerNetwork.");
    }

    @Override
    public int[][] getShape() {
        return new int[0][0];
    }
}
