/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.epl.datetime.dtlocal;

import com.espertech.esper.codegen.base.CodegenClassScope;
import com.espertech.esper.codegen.base.CodegenMethodScope;
import com.espertech.esper.codegen.model.expression.CodegenExpression;
import com.espertech.esper.epl.datetime.reformatop.ReformatForge;
import com.espertech.esper.epl.expression.codegen.ExprForgeCodegenSymbol;

public class DTLocalZonedDateTimeReformatForge extends DTLocalReformatForgeBase {
    public DTLocalZonedDateTimeReformatForge(ReformatForge reformatForge) {
        super(reformatForge);
    }

    public DTLocalEvaluator getDTEvaluator() {
        return new DTLocalZonedDateTimeReformatEval(reformatForge.getOp());
    }

    public CodegenExpression codegen(CodegenExpression inner, Class innerType, CodegenMethodScope codegenMethodScope, ExprForgeCodegenSymbol exprSymbol, CodegenClassScope codegenClassScope) {
        return reformatForge.codegenZDT(inner, codegenMethodScope, exprSymbol, codegenClassScope);
    }
}
