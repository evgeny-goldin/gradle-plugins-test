
ruleset {

    description 'TeamCity plugins CodeNarc RuleSet'

    ruleset( "http://codenarc.sourceforge.net/StarterRuleSet-AllRulesByCategory.groovy.txt" ) {

        Println                  ( enabled : false )
        DuplicateNumberLiteral   ( enabled : false )
        DuplicateStringLiteral   ( enabled : false )
        BracesForClass           ( enabled : false )
        BracesForMethod          ( enabled : false )
        BracesForIfElse          ( enabled : false )
        BracesForForLoop         ( enabled : false )
        BracesForTryCatchFinally ( enabled : false )
        JavaIoPackageAccess      ( enabled : false )
        VariableName             ( enabled : false )
        FactoryMethodName        ( enabled : false )
        LineLength               ( length  : 160   )
        MethodName               ( regex   : /[a-z][\w\s'\(\)]*/ ) // Spock method names
    }
}
