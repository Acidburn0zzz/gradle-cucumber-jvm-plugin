ruleset {
    description 'CodeNarc Rules'

    ruleset('rulesets/basic.xml') {
        'EmptyMethod' enabled: false
    }
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/convention.xml') {
        'NoDef' enabled: false
    }
    ruleset('rulesets/design.xml') {
        'AbstractClassWithoutAbstractMethod' enabled: false
        'AbstractClassWithPublicConstructor' enabled: false
        'Instanceof' enabled: false
    }
    ruleset('rulesets/dry.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml') {
        'SpaceAroundMapEntryColon' characterAfterColonRegex: ' '
    }
    ruleset('rulesets/generic.xml')
    ruleset('rulesets/groovyism.xml')
    ruleset('rulesets/imports.xml') {
        'MisorderedStaticImports' enabled: false
    }
    ruleset('rulesets/jdbc.xml')
    ruleset('rulesets/junit.xml')
    ruleset('rulesets/logging.xml')
    ruleset('rulesets/naming.xml') {
        'FactoryMethodName' enabled: false
        'FieldName' enabled: false
        'VariableName' finalRegex: /[a-z][a-zA-Z0-9]*/
    }
    ruleset('rulesets/security.xml') {
        'JavaIoPackageAccess' enabled: false
    }
    ruleset('rulesets/size.xml') {
        // enable it for cobertura
        'CrapMetric' enabled: false
    }
    ruleset('rulesets/unnecessary.xml') {

        // disabling due to code narc bug => http://sourceforge.net/tracker/?func=detail&atid=1126573&aid=3524882&group_id=250145
        'UnnecessaryPackageReference' enabled: false

        'UnnecessaryReturnKeyword' enabled: false
        'UnnecessaryPublicModifier' enabled: false
    }
    ruleset('rulesets/unused.xml') {
        'UnusedMethodParameter'  enabled: false
    }
    IllegalClassReference {
        name = 'DoNotReferenceGradleApiInternals'
        priority = 1
        classNames = 'org.gradle.*internal*'
        applyToClassNames = '*'
        description = 'Do not reference Gradle API internals. These classes are not guaranteed to maintain compatibility between Gradle releases..'
    }
}
