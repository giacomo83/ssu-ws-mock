package it.gov.agid.ssu.mock.bo;

import it.gov.agid.ssu.ws.back_office.service.BackOfficeFaultMessage;
import it.gov.agid.ssu.ws.message.types.HeaderIstanzaType;
import it.gov.agid.ssu.ws.message.types.HeaderParereEnteTerzoType;
import it.gov.agid.ssu.ws.message.types.HeaderRichiestaIntegrazioneType;
import it.gov.agid.ssu.ws.message.types.IstanzaType;
import it.gov.agid.ssu.ws.message.types.ParereEnteTerzoType;
import it.gov.agid.ssu.ws.message.types.RichiestaIntegrazioneType;

public interface BackOfficeDelegate {

	
	HeaderIstanzaType riceviIstanza(IstanzaType parameters) throws BackOfficeFaultMessage;

	HeaderRichiestaIntegrazioneType riceviRichiestaIntegrazione(RichiestaIntegrazioneType parameters) throws BackOfficeFaultMessage;

	HeaderParereEnteTerzoType riceviParereEnteTerzo(ParereEnteTerzoType parameters) throws BackOfficeFaultMessage;
	
	
}
