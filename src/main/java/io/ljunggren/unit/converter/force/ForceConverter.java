package io.ljunggren.unit.converter.force;

import io.ljunggren.unit.converter.Converter;
import io.ljunggren.unit.converter.base.BaseNoChange;
import io.ljunggren.unit.converter.force.base.BaseForceSiToUs;
import io.ljunggren.unit.converter.force.base.BaseForceUsToSi;
import io.ljunggren.unit.converter.force.unit.si.Newton;
import io.ljunggren.unit.converter.force.unit.us.PoundForce;

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
