import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameImpl implements Game {
    private Player Jogador1;
    private Player Jogador2;
    private Card[] cards = Card.createCards();

    public GameImpl() {

    }
    public GameImpl(String jog1, String jog2) {
        this.Jogador1 = new Player(jog1, Color.BLUE, cards[0], cards[1]);
        this.Jogador2 = new Player(jog2, Color.RED, cards[2], cards[3]);
    }

    public GameImpl(String jog1, String jog2, Card[] cards) {
        this(jog1, jog2);
        this.cards = cards;

        List<Card> cardList = Arrays.asList(this.cards);
        Collections.shuffle(cardList);
        cardList.toArray(cards);

        Card[] gameCards = new Card[5];

        for(int i = 0; i < 5; i++) {
            gameCards[i] = cards[i];
        }

        this.cards = gameCards;
        this.Jogador1 = new Player(jog1, Color.BLUE, cards[0], cards[1]);
        this.Jogador2 = new Player(jog2, Color.RED, cards[2], cards[3]);
    }


    @Override
    public Color getSpotColor(Position position) {
        return null;
    }

    @Override
    public Piece getPiece(Position position) {
        return null;
    }

    @Override
    public Card getTableCard() {
        return cards[4];
    }

    @Override
    public Player getRedPlayer() {
        return null;
    }

    @Override
    public Player getBluePlayer() {
        return null;
    }

    @Override
    public void makeMove(Card card, Position cardMove, Position currentPos) throws IncorrectTurnOrderException, IllegalMovementException, InvalidCardException, InvalidPieceException {

    }

    @Override
    public boolean checkVictory(Color color) {
        return false;
    }

    @Override
    public void printBoard() {

    }
}
