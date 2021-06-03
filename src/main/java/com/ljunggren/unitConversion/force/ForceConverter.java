package com.ljunggren.unitConversion.force;

import com.ljunggren.unitConversion.Converter;
import com.ljunggren.unitConversion.base.BaseNoChange;
import com.ljunggren.unitConversion.force.base.BaseForceSiToUs;
import com.ljunggren.unitConversion.force.base.BaseForceUsToSi;
import com.ljunggren.unitConversion.force.units.si.Newton;
import com.ljunggren.unitConversion.force.units.us.PoundForce;

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
