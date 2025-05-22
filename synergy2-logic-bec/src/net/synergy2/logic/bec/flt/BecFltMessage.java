package net.synergy2.logic.bec.flt;

import net.synergy2.base.types.IMessage;
import net.synergy2.base.types.IMessageInstaller;

public enum BecFltMessage implements IMessage, IMessageInstaller {
    becFltColNotValid("Colonna del filtro non valida"),
    becFltColNotChanged("La colonna del filtro non è cambiata"),
    becFltColNotDeleted(
        "La colonna non può essere eliminata perché legata al filtro \"{1}\""
    );

    private final String message;
    private final String code;

    BecFltMessage(String message) {
        this.message = message;
        this.code = this.name();
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getCode() {
        return this.code;
    }
}
