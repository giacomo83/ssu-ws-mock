package it.gov.agid.ssu.mock.bo;

import it.gov.agid.ssu.ws.back_office.service.BackOfficeFaultMessage;
import it.gov.agid.ssu.ws.back_office.service.BackOfficeServicePort;
import it.gov.agid.ssu.ws.message.types.HeaderIstanzaType;
import it.gov.agid.ssu.ws.message.types.HeaderParereEnteTerzoType;
import it.gov.agid.ssu.ws.message.types.HeaderRichiestaIntegrazioneType;
import it.gov.agid.ssu.ws.message.types.IstanzaType;
import it.gov.agid.ssu.ws.message.types.ParereEnteTerzoType;
import it.gov.agid.ssu.ws.message.types.RichiestaIntegrazioneType;

public class BackOfficeServiceImpl implements BackOfficeServicePort{

	@Override
	public HeaderIstanzaType riceviIstanza(IstanzaType parameters) throws BackOfficeFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeaderRichiestaIntegrazioneType riceviRichiestaIntegrazione(RichiestaIntegrazioneType parameters) throws BackOfficeFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeaderParereEnteTerzoType riceviParereEnteTerzo(ParereEnteTerzoType parameters) throws BackOfficeFaultMessage {
		// TODO Auto-generated method stub
		return null;
	}

}
