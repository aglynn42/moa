/*
 *    ClusteringStream.java
 *    Copyright (C) 2010 RWTH Aachen University, Germany
 *    @author Jansen (moa@cs.rwth-aachen.de)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *    
 *    
 */

package moa.streams.clustering;

import moa.options.AbstractOptionHandler;
import com.github.javacliparser.FloatOption;
import com.github.javacliparser.IntOption;
import com.github.javacliparser.IntOptionParameter2;

import moa.streams.InstanceStream;

public abstract class ClusteringStream extends AbstractOptionHandler implements InstanceStream{
    public IntOption decayHorizonOption = IntOption.createIntOption2(new IntOptionParameter2("decayHorizon", 'h', "Decay horizon", 1000, 0, Integer.MAX_VALUE));

    public FloatOption decayThresholdOption = new FloatOption("decayThreshold", 't',
                    "Decay horizon threshold", 0.01, 0, 1);

    public IntOption evaluationFrequencyOption = IntOption.createIntOption2(new IntOptionParameter2("evaluationFrequency", 'e', "Evaluation frequency", 1000, 0, Integer.MAX_VALUE));

    public IntOption numAttsOption = IntOption.createIntOption2(new IntOptionParameter2("numAtts", 'a', "The number of attributes to generate.", 2, 0, Integer.MAX_VALUE));

    public int getDecayHorizon(){
        return decayHorizonOption.getValue();
    }

    public double getDecayThreshold(){
        return decayThresholdOption.getValue();
    }

    public int getEvaluationFrequency(){
        return evaluationFrequencyOption.getValue();
    }


}
