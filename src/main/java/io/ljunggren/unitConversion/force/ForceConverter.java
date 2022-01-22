package io.ljunggren.unitConversion.force;

import io.ljunggren.unitConversion.Converter;
import io.ljunggren.unitConversion.base.BaseNoChange;
import io.ljunggren.unitConversion.force.base.BaseForceSiToUs;
import io.ljunggren.unitConversion.force.base.BaseForceUsToSi;
import io.ljunggren.unitConversion.force.unit.si.Newton;
import io.ljunggren.unitConversion.force.unit.us.PoundForce;

public class ForceConverter extends Converter {

    public ForceConverter() {
        super(new BaseForceUsToSi()
                .nextChain(new BaseForceSiToUs()
                .nextChain(new BaseNoChange())));
    }
    
    public ForceConverter fromPoundForce() {
        return setFrom(new PoundForce());
    }
    public ForceConverter toPoundForce() {
        return setTo(new PoundForce());
    }
    
    public ForceConverter fromNewtons() {
        return setFrom(new Newton());
    }
    public ForceConverter toNewtons() {
        return setTo(new Newton());
    }

}
