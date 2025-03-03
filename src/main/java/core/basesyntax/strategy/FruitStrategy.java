package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;

public interface FruitStrategy {
    OperationHandler get(FruitTransaction.Operation operation);
}
