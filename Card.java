import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Classe que contém informações das cartas
 */
public class Card {
    private final String name;
    private final Color color;
    private final Position[] positions;

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", positions=" + Arrays.toString(positions) +
                '}';
    }

    /**
     * Construtor que define os principais atributos de uma cara
     * @param name Nome da carta
     * @param color Cor da carta
     * @param positions Todas as posições relativas de movimento
     */
    public Card(String name, Color color, Position[] positions) {
        this.name = name;
        this.color = color;
        this.positions = positions;
    }

    /**
     * Método que devolve o nome da carta
     * @return String que contém o nome da carta
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método que devolve a cor da carta
     * @return Enum Color que contém a cor da carta
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Método que devolve todas as possíveis posições relativas de movimento.
     * A posição atual da peça é o ponto de origem (0,0). Uma carta possui as possíveis posições de movimento em relação ao ponto de origem.
     * @return Um array de Position contendo todas as possíveis posições de movimento em relação ao ponto de origem
     */
    public Position[] getPositions() {
        return this.positions;
    }

    /**
     * Método que cria todas as cartas do jogo, embaralha-as e devolve as 5 que serão utilizadas na partida.
     * @return Vetor de cartas com todas as cartas do jogo
     */
    public static Card[] createCards() {
        Position[] positionTiger = new Position[2];
        positionTiger[0] = new Position(1,0);
        positionTiger[1] = new Position(-2, 0);

        Position[] positionDragon = new Position[4];
        positionDragon[0] = new Position(-1, -2);
        positionDragon[1] = new Position(-1, 2);
        positionDragon[2] = new Position(1, -1);
        positionDragon[3] = new Position(1, 1);

        Position[] positionFrog = new Position[3];
        positionFrog[0] = new Position(0, -2);
        positionFrog[1] = new Position(-1, -1);
        positionFrog[2] = new Position(1, 1);

        Position[] positionRabbit = new Position[3];
        positionRabbit[0] = new Position(1, -1);
        positionRabbit[1] = new Position(-1, 1);
        positionRabbit[2] = new Position(0, 2);

        Position[] positionCrab = new Position[3];
        positionCrab[0] = new Position(0, -2);
        positionCrab[1] = new Position(-1, 0);
        positionCrab[2] = new Position(0, 2);

        Position[] positionElephant = new Position[4];
        positionElephant[0] = new Position(0, -1);
        positionElephant[1] = new Position(-1, -1);
        positionElephant[2] = new Position(-1, 1);
        positionElephant[3] = new Position(0, 1);

        Position[] positionGoose = new Position[4];
        positionGoose[0] = new Position(0, -1);
        positionGoose[1] = new Position(-1, -1);
        positionGoose[2] = new Position(1, 1);
        positionGoose[3] = new Position(0, 1);

        Position[] positionRooster = new Position[4];
        positionRooster[0] = new Position(0, -1);
        positionRooster[1] = new Position(1, -1);
        positionRooster[2] = new Position(-1, 1);
        positionRooster[3] = new Position(0, 1);


        Card[] cards = {
                new Card("TIGER", Color.BLUE, positionTiger),
                new Card("DRAGON", Color.RED, positionDragon),
                new Card("FROG", Color.RED, positionFrog),
                new Card("RABBIT", Color.BLUE, positionRabbit),
                new Card("CRAB", Color.BLUE, positionCrab),
                new Card("ELEPHANT", Color.RED, positionElephant),
                new Card("GOOSE", Color.BLUE, positionGoose),
                new Card("ROOSTER", Color.RED, positionRooster)
        };

        List<Card> cardList = Arrays.asList(cards);
        Collections.shuffle(cardList);
        cardList.toArray(cards);

        Card[] gameCards = new Card[5];

        for(int i = 0; i < 5; i++) {
            gameCards[i] = cards[i];
        }


        return gameCards;
    }
}
