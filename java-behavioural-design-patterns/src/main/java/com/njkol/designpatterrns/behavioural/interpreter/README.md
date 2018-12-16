
## Components of Interpreter pattern

# Client : Builds (or is provided) the AST assembled from TerminalExpression and NonTerminalExpression. The Client invokes the interpret() operation.
# Context : Has the data which I want to interpret ( Shown here by Alert )
# AbstractExpression : Provides an interface for executing an operation ( Shown here by Criteria )
# TerminalExpression : Create classes for each notations involved in the grammar  ( Shown here by Market,Date & Conditional Criteria  )
           
                       
* Each notation should be capable of interpreting itself ( So, the AbstractExpression must provide the interpret method )

