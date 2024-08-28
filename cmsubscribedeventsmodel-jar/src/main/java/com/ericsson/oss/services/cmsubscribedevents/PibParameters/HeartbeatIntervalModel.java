/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2022
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.cmsubscribedevents.PibParameters;

import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinition;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinitions;
import com.ericsson.oss.itpf.modeling.annotation.configparam.Scope;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Max;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Min;

    @EModel(namespace = "cm",
        description = "ModeledConfiguration For Cm Subscribed Events Heartbeat Interval PIB parameter")
    @ConfParamDefinitions
    public class HeartbeatIntervalModel {

        @ConfParamDefinition(description = "Heartbeat Interval", scope = Scope.GLOBAL)
        @DefaultValue("30")
        @Min(value = 0)
        @Max(value = 60)
        public int cmSubscribedEventsHeartbeatInterval;
}