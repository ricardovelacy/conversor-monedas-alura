package converter.strategies.currency;

import java.io.IOException;

import converter.strategies.ConversionStrategy;
import converter.utils.ConversoraDivisasOnline;

public abstract class DivisasStrategy extends ConversionStrategy {

	@Override
	public void setNewAmount(double amount) throws Exception {
		conversion = new ConversoraDivisasOnline();
		this.newAmount = conversion.convertCurrency(this.have, this.want, amount);
	}

	@Override
	public void close() {
		conversion.close();
	}
}
