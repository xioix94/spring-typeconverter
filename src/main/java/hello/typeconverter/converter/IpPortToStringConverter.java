package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {

    @Override
    public String convert(IpPort source) {
        log.info("convert source={}", source);
        /**
         * {
         * ip: "127.0.0.1" //string
         * port: 8080      //int
         */
        return source.getIp() + ":" + source.getPort();
    }
}
